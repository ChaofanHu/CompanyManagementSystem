package pri.chaofan.pojo;

public class Brand {
    private String brandName;
    private String companyName;

    public Brand() {
    }

    public Brand(String brandName, String companyName) {
        this.brandName = brandName;
        this.companyName = companyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
