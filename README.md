Суть задачи
========================
1) Написать приложение на SpringBoot, которое принимает GET параметры для сообщения: title и text и отображает их на html странице. Например 127.0.0.1:111111?title=test&text=asdf
2) Добавить функционал который добавляет сообщение в базу данных и выводит список сообщений из базы.

##GET запрос http://127.0.0.1:7777/
Возвратит html страницу с формой для отправки POST запроса на добавление сообщения,
а также таблицу с уже добавленными сообщениями в БД.
[!get](https://github.com/RodionYesipov/JE29testSpringBoot/blob/master/src/main/resources/screens/get.PNG)

##POST
Форма для ввода сообщения отправляет POST запрос на тот же урл http://127.0.0.1:7777/ 
добавляет данные в БД и возвращает ту же html страницу со списком всех сообщений из БД.
 [!post](https://github.com/RodionYesipov/JE29testSpringBoot/blob/master/src/main/resources/screens/post.PNG)

##GET с параметрами text, title
Пример запроса http://127.0.0.1:7777/getmessage/?text=mess1&title=mess1Title

**Результат**

 [!getByTitleAndText](https://github.com/RodionYesipov/JE29testSpringBoot/blob/master/src/main/resources/screens/getMessByTextAndTitle.PNG)
