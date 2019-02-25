DROP TABLE IF EXISTS note;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE note
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  data             VARCHAR                 NOT NULL,
  is_done           BOOL DEFAULT FALSE       NOT NULL
);