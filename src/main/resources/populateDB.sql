DELETE FROM note;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO note (data) VALUES
  ('Тесты это прекрасно'),
  ('Тесты это отлично');