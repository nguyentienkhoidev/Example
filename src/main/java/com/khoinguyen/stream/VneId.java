package com.khoinguyen.stream;

public class VneId {
  private String cccd;
  private String name;
  private String gender;

  public VneId() {
  }

  public VneId(String cccd, String name, String gender) {
    this.cccd = cccd;
    this.name = name;
    this.gender = gender;
  }

  public String getCccd() {
    return cccd;
  }

  public void setCccd(String cccd) {
    this.cccd = cccd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
