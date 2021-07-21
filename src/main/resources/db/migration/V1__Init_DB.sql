CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE SCHEMA IF NOT EXISTS usoamicapp;

CREATE TABLE IF NOT EXISTS usoamicapp.users
(
    user_id     uuid DEFAULT uuid_generate_v4(),
    private_key VARCHAR NOT NULL,
    phone       VARCHAR NOT NULL,
    PRIMARY KEY (user_id)
);