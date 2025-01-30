public class Software extends Product {
    private String version;
    public Software(){
        version = "";
        // setCode(Validator.getString("Please enter the Code: "));
        // setDescription(Validator.getString("Please enter the Description: "));
        // setPrice(Validator.getDouble("Please enter the Price: "));
        // version = Validator.getString("Please enter the version: ");
    }
    
    public Software (String code, String description, double price, String version){
        super(code, description, price);
        this.version = version;
    }

    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return version;
    }

    @Override
    public String toString(){
        return super.toString() + "\nVersion:    " + version ;
    }
}
