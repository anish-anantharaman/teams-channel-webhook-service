package com.anish.teams.util;

public class Constants {

    private Constants() { }

    public static final class TeamsConstants {

        private TeamsConstants() { }

        public static final String TEXT_BLOCK = "TextBlock";
        public static final String CONTENT_TYPE_VALUE = "application/vnd.microsoft.card.adaptive";
        public static final String ADAPTIVE_CARD = "AdaptiveCard";
        public static final String ACTION_TYPE_VALUE = "Action.OpenUrl";
        public static final String LARGE = "Large";
        public static final String EXTRA_LARGE = "ExtraLarge";
        public static final String MEDIUM = "Medium";
        public static final String BOLDER = "Bolder";

    }

    public static final class CommonConstants {

        private CommonConstants() { }

        public static final String CONTENT = "content";
        public static final String CONTENT_TYPE = "contentType";
        public static final String TYPE = "type";
        public static final String BODY = "body";
        public static final String ACTIONS = "actions";
        public static final String REQUEST_ID_HEADER = "X-Request-Id";
        public static final String REQUEST_ID = "requestId";
        public static final String MESSAGE = "message";
        public static final String ATTACHMENTS = "attachments";
        public static final String TITLE = "title";
        public static final String URL = "url";
        public static final String TEXT = "text";
        public static final String SIZE = "size";
        public static final String WEIGHT = "weight";
        public static final String WRAP = "wrap";
        public static final String STYLE = "style";
        public static final String HEADING = "heading";

    }

    public static final class SwaggerDocExamples {

        private SwaggerDocExamples() {} // prevent instantiation

        public static final String SUCCESS = """
        {
          "statusCode": 202,
          "statusMessage": "Accepted",
          "message": "Notification queued successfully",
          "data": true
        }
        """;

        public static final String BAD_REQUEST = """
        {
          "statusCode": 400,
          "statusMessage": "Bad Request",
          "message": "url : must be a valid URL; buttonTitle : must not be blank; ",
          "data": false
        }
        """;

        public static final String INTERNAL_SERVER_ERROR = """
        {
          "statusCode": 500,
          "statusMessage": "Internal Server Error",
          "message": "Failed to queue the notification",
          "data": false
        }
        """;
    }
}
