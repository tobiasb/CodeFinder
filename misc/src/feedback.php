
  <?php
    require("phpmailer/class.phpmailer.php");
    $mail = new PHPMailer();

    // ---------- adjust these lines ---------------------------------------
    $mail->Username = "hooooooooray@googlemail.com";
    $mail->Password = "l6kh55BSSmE0K4dC"; 
    $mail->AddAddress("hooooooooray@googlemail.com");
    $mail->FromName = "Code Search Plugin";

    $mail->Subject = "Code Search Feedback";
    $mail->Body    = "Feedback: " . $_POST["feedback"];
    //-----------------------------------------------------------------------

    $mail->Host = "ssl://smtp.gmail.com"; // GMail
    $mail->Port = 465;
    $mail->IsSMTP(); // use SMTP
    $mail->SMTPAuth = true; // turn on SMTP authentication
    $mail->From = $mail->Username;
    if(!$mail->Send())
        echo "Mailer Error: " . $mail->ErrorInfo;
    else
        echo "Message has been sent";
    ?>