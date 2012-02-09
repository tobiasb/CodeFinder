package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor.QL1Query;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FirstImpl;

public class QL1QueryExtractor implements IUnitOfWork<QL1Query, XtextResource> {

    @Override
    public QL1Query exec(XtextResource state) throws Exception {
        IParseResult r = state.getParseResult();
        FirstImpl root = (FirstImpl) r.getRootASTElement();

        QL1Query q = new QL1Query();
        q.type = root.getType();
        q.exp = root.getE();
        q.containsClauses = root.getC();
        return q;
    }

    public class QL1Query {
        public Type type;
        public Expression exp;
        public List<Contains> containsClauses;
    }
}
