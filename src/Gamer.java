import javax.swing.*;
import java.io.File;

public class Gamer
{
    // has-a userName
    private String userName;
    // has-an avatar
    private Icon avatar = new ImageIcon("img/profilepic.jpg");
    // has-a firstName
    private String firstName;
    // has-a lastName
    private String lastName;
    // has-an email
    private String email;
    // has-a password
    private String password;
    // has-a password checker
    private boolean isPasswordIdentical;
    // has-a phone number
    private String phoneNumber;
    // has-many games played
    private String[] gamesPlayed = new String[200];
    // has-a bio
    private String bio;

    /**
     * @brief Create a Gamer
     * @param newUserName
     * @param newEmail
     * @param newPassword
     */
    public Gamer(String newUserName, String newEmail, String newPassword)
    {
        userName = newUserName;
        email = newEmail;
        password = newPassword;
    }

    /**
     * @brief Set the name
     * @param newFirstName
     * @param newLastName
     */
    public void setName(String newFirstName, String newLastName)
    {
        firstName = newFirstName;
        lastName = newLastName;
    }

    // Purpose: Return full name
    public String getName()
    {
        return firstName + " " + lastName;
    }

    // Purpose: Return password
    public String getPassword()
    {
        return password;
    }

    /**
     * @brief Set the phone number
     * @param newPhoneNumber
     */
    public void setPhoneNumber(String newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }

    // Purpose: Return phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @brief Compare inputted password to password to see if they are identical
     * @param currentPassword
     * @return
     */
    public boolean checkPassword(String currentPassword)
    {
        if (password.equals(currentPassword))
        {
            isPasswordIdentical = true;
        }
        else
        {
            isPasswordIdentical = false;
        }
        return isPasswordIdentical;
    }

    /**
     * @brief Set new avatar image
     * @param newAvatarURL
     */
    public void setAvatar(String newAvatarURL)
    {
        Icon newAvatar = new ImageIcon(newAvatarURL);
        avatar = newAvatar;
    }

    // Purpose: Return avatar
    public Icon getAvatar()
    {
        return avatar;
    }

    /**
     * @brief Set the bio
     * @param newBio
     */
    public void setBio(String newBio)
    {
        bio = newBio;
    }

    // Purpose: Return bio
    public String getBio()
    {
        return bio;
    }

    // Purpose: Return user name
    public String getUserName()
    {
        return userName;
    }
}
