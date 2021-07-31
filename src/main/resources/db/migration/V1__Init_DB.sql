CREATE SCHEMA IF NOT EXISTS usoamicapp;

CREATE TABLE IF NOT EXISTS usoamicapp.users
(
    user_id     uuid NOT NULL,
    private_key VARCHAR NOT NULL,
    phone       VARCHAR NOT NULL,
    PRIMARY KEY (user_id)
);