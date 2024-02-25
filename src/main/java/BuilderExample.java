class BuilderExample {

    private String arabaMarka;
    private String arabaModel;
    private int yil;
    private String renk;

    //constructor method
    public BuilderExample()
    { }

    //GETTERS

    public String getArabaMarka() {
        return arabaMarka;
    }

    public String getArabaModel() {
        return arabaModel;
    }

    public int getYil() {
        return yil;
    }

    public String getRenk() {
        return renk;
    }

    public static BuilderExampleBuilder builder()
    {
        return new BuilderExampleBuilder();
    }

    public static class BuilderExampleBuilder {

        private BuilderExample araba;

        public BuilderExampleBuilder()
        {
            araba= new BuilderExample();
        }

        public BuilderExampleBuilder withMarka(String arabaMarka)
        {
            araba.arabaMarka=arabaMarka;
            return this;
        }

        public BuilderExampleBuilder withModel(String arabaModel)
        {
            araba.arabaModel=arabaModel;
            return this;
        }

        public BuilderExampleBuilder withYil(int yil)
        {
            araba.yil=yil;
            return this;
        }

        public BuilderExampleBuilder withRenk(String renk)
        {
            araba.renk=renk;
            return this;
        }

        public BuilderExample build()
        {
            return araba;
        }

    }

}
