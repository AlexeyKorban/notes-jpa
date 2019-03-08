[![Codacy Badge](https://api.codacy.com/project/badge/Grade/152fd39874b14057a4142cc70d575434)](https://www.codacy.com/app/AlexeyKorban/notes-jpa?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=AlexeyKorban/notes-jpa&amp;utm_campaign=Badge_Grade)

Реализовать простенькое приложение Notes-list, для отображения списка заметок.
Нужно показывать список уже созданных заметок (с пейджингом по 10 заметок на странице). Каждую из них можно редактировать, добавлять новые, отмечать как «Выполнено», удалять. Список можно фильтровать как «Все заметки», «Только невыполненные», «Выполненные».
Заметки хранить в базе. Схему таблички для хранения нужно придумать самому (можно ограничиться одной таблицей).
Бизнес-требование: кроме фильтрации должна быть возможность сортировки заметок по дате создания (например, поле createdDate в БД). Тип поля – DATE или DATETIME, или TIMESTAMP.