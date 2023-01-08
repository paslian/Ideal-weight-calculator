/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public abstract class IdealOld {
    private double tb, bb, total;
    private String gender;
    private String result;
    private String admin;
    String info;

    public void setTb(double tb) {
        this.tb = tb / 100;
    }

    public double getTb() {
        return tb;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setBb(double bb) {
        this.bb = bb;
    }

    public double getBb() {
        return bb;
    }

    public void setTotal(double total) {
        this.total = total;
    }

  public double getTotal() {
        return total = this.bb / (this.tb * this.tb);
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }


}



