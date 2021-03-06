package at.kuangsheng.Factory.builder.builder02;

/**
 * @Author Dragon
 * @Description 产品
 * @Date $ $
 * @Param $
 **/
//新的产品，有了一些默认值
public class Product {
    private String buildA="汉堡";
    private String buildB="可乐";
    private String buildC="鸡翅";
    private String buildD="薯条";

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }
}
