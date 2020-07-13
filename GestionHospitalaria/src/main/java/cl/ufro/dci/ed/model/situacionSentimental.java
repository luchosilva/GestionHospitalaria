package cl.ufro.dci.ed.model;

public enum situacionSentimental {
    SOLTERO("SOLTERO/A"),COMPROMETIDO("COMPROMETIDO/A"),CASADO("CASADO/A"),DIVORCIADO("DIVORCIADO/A"),VIUDO("VIUDO/A");
    private String situacionSentimental;

    situacionSentimental(String situacionSentimental) {
        this.situacionSentimental = situacionSentimental;
    }

    public String getSituacionSentimental() {
        return situacionSentimental;
    }

    public void setSituacionSentimental(String situacionSentimental) {
        this.situacionSentimental = situacionSentimental;
    }
}
