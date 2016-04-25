package statistics;

import statistics.matcher.*;

public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        matcher = new And();
    }

    public Matcher build() {
        return matcher;
    }

    QueryBuilder playsIn(String str) {
        this.matcher = new And(matcher, new PlaysIn(str));
        return this;
    }

    QueryBuilder hasAtLeast(int num, String field) {
        this.matcher = new And(matcher, new HasAtLeast(num, field));
        return this;
    }

    QueryBuilder hasFewerThan(int num, String field) {
        this.matcher = new And(matcher, new HasFewerThan(num, field));
        return this;
    }
    
    QueryBuilder not(Matcher q) {
        this.matcher = new And(matcher, new Not(q));
        return this;
    }
    
    QueryBuilder oneOf(Matcher q, Matcher b) {
        this.matcher = new Or(q, b);
        return this;
    }

}
