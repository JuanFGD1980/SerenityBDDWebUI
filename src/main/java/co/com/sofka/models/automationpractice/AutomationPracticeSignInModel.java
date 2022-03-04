package co.com.sofka.models.automationpractice;

import co.com.sofka.utils.Title;

import java.util.Collections;
import java.util.List;

public class AutomationPracticeSignInModel {

    private List<Title> title;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String dayBirth;
    private String monthBirth;
    private String yearBirth;
    private String newsletter;
    private String offers;
    private String company;
    private String address;
    private String addressAux;
    private String city;
    private String state;
    private String zip;
    private String addInformation;
    private String homePhone;
    private String movilePhone;
    private String aliasAddress;

    public List<Title> getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = Collections.singletonList(title);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(String dayBirth) {
        this.dayBirth = dayBirth;
    }

    public String getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(String monthBirth) {
        this.monthBirth = monthBirth;
    }

    public String getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressAux() {
        return addressAux;
    }

    public void setAddressAux(String addressAux) {
        this.addressAux = addressAux;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddInformation() {
        return addInformation;
    }

    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMovilePhone() {
        return movilePhone;
    }

    public void setMovilePhone(String movilePhone) {
        this.movilePhone = movilePhone;
    }

    public String getAliasAddress() {
        return aliasAddress;
    }

    public void setAliasAddress(String aliasAddress) {
        this.aliasAddress = aliasAddress;
    }
}
