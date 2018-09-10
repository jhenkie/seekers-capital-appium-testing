package mobility.constants;

public class MessageConstants {
    public static class Login {
        //Fill in data
        public static String username = "admin";
        public static String password = "admin";
        public static String dummyPassword = "xx";

        //text message
        public static String errorUsername = "Please fill in username";
        public static String errorPassword = "Please fill in password";
        public static String errorInvalid = "Invalid login";

        public static class BottomMessage {
            public static String about = "About";
            public static String location = "Location";
            public static String team = "Team";
        }

    }

    public static class Profile {
        //Fill in data
        public static String Message = "Welcome to Seekers!";
    }

    public static class About {
        public static String headerText = "Seekers Capital Group Limited";
        public static String bodyText = "Seekers Capital Group Limited (together with its affiliates, “Seekers Capital”) is a Pan-Asian asset management organization that specializes in providing our investors with unique investment opportunities and asset management services.";
    }

    public static class Location {
        public static String titleText = "Hong Kong\n" +
                "Seekers Advisors H.K. Limited.";
        public static String bodyText = "21/F, China United Centre\n" +
                "28 Marble Road, North Point \n" +
                "Hong Kong";
        public static String contactText = "info@seekersadvisors.com\n" +
                "+852 3198 0788";
    }

    public static class Team {
        public static String idText = "57b378da202bba0005a61b87\n" +
                "57b37929202bba0005a61b89\n" +
                "57b37904202bba0005a61b88\n";
        public static String userNameText = "Manuel\n" +
                "Cristina\n" +
                "Ramón\n";
        public static String userLastNameText = "Morejón\n" +
                "Cruz\n" +
                "Cabrera\n";
    }
}
