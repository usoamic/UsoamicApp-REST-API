CREATE SCHEMA IF NOT EXISTS usoamicapp;

CREATE TABLE IF NOT EXISTS usoamicapp.users
(
    user_id      uuid NOT NULL,
    wallet_name  VARCHAR NOT NULL,
    phone_number VARCHAR NOT NULL,
    chat_id      VARCHAR NOT NULL,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (user_id)
);