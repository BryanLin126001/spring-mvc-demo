package ntt.global;

import java.util.LinkedHashMap;

public class Student
{
    private String firstName;

    private String lastName;

    private String country;

    private String favoriteLanguage;


    private LinkedHashMap<String, String> countryOptions;

    public Student()
    {
        countryOptions = new LinkedHashMap<String, String>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("TW", "Taiwan");
    }



    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryOptions()
    {
        return countryOptions;
    }

    public String getFavoriteLanguage()
    {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage)
    {
        this.favoriteLanguage = favoriteLanguage;
    }
}
