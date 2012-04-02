package org.eclipse.recommenders.internal.codesearch.rcp.views;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FeedbackForm {
    private Display display;
    private Shell shell;
    private Text feedbackText;
    private String query;
    private String newLine = System.getProperty("line.separator");

    public FeedbackForm(final Display d, final String query) {
        display = d;
        shell = new Shell(display);
        this.query = query;
        shell.setLayout(new GridLayout(1, false));
        shell.setText("Feedback Form");

        feedbackText = new Text(shell, SWT.MULTI | SWT.BORDER | SWT.WRAP);
        feedbackText.setText(getDefaultFeedback());

        final Button button = new Button(shell, SWT.PUSH);
        button.setText("Submit");
        button.setEnabled(hasText());

        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 400;
        gd.heightHint = 200;
        feedbackText.setLayoutData(gd);

        feedbackText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                button.setEnabled(hasText());
            }
        });

        button.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                sendFeedback();
                shell.close();
            }
        });

        shell.pack();
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        // display.dispose();
    }

    private boolean hasText() {
        return feedbackText.getText().length() > 0;
    }

    private String getDefaultFeedback() {
        String lineSep = "----------------------------";

        if (query.trim().length() > 0)
            return "My query was: " + newLine + lineSep + newLine + query + newLine + lineSep + newLine;

        return "";
    }

    protected void sendFeedback() {
        try {
            String body = "feedback=" + URLEncoder.encode(feedbackText.getText(), "UTF-8");

            URL url = new URL("http://www.g-labz.de/feedback.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", String.valueOf(body.length()));

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(body);
            writer.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            for (String line; (line = reader.readLine()) != null;) {
                // System.out.println(line);
            }

            writer.close();
            reader.close();
        } catch (Exception ex) {

        }
    }
}