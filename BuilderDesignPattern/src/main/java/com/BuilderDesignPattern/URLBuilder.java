package com.BuilderDesignPattern;

public class URLBuilder {
    public static class Builder{
        private String protocol;
        private String hostname;
        private String port;
        private String pathparam;
        private String queryparam;

        public Builder protocol(String protocol){
            this.protocol=protocol;
            return this;
        }
        public Builder hostname(String hostname){
            this.hostname=hostname;
            return this;
        }
        public Builder port(String port){
            this.port=port;
            return this;
        }
        public Builder pathparam(String pathparam){
            this.pathparam=pathparam;
            return this;
        }
        public Builder queryparam(String queryparam){
            this.queryparam=queryparam;
            return this;
        }

        public URLBuilder build(){
            return new URLBuilder(this);
        }
    }

    public final String protocol;
    public final String hostname;
    public final String port;
    public final String pathparam;
    public final String queryparam;

    private URLBuilder(Builder builder){
        this.protocol=builder.protocol;
        this.hostname=builder.hostname;
        this.port=builder.port;
        this.pathparam=builder.pathparam;
        this.queryparam=builder.queryparam;
    }
}