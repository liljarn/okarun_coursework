CREATE TABLE email_templates
(
    template_id        INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    notification_event TEXT NOT NULL UNIQUE,
    subject            TEXT NOT NULL,
    html_template      TEXT NOT NULL
);
