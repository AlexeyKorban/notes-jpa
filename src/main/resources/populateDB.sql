DELETE FROM note;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO note (data) VALUES
  ('Первая заметка'),
  ('Вторая заметка'),
  ('Третья заметка'),
  ('Четвертая заметка'),
  ('Пятая заметка'),
  ('Шестая заметка');