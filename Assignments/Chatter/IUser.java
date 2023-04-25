package Assignments.Chatter;

import java.awt.*;

public interface IUser
{
     String userName = "";
     Server userServer = null;
     Color userColor = null;

     void showMessage(String message);
     void setUpFrame();
     String getName();
     void setServer(Server ser);
}
