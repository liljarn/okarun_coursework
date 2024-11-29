INSERT INTO email_templates (notification_event, subject, html_template)
VALUES ('GREETING', 'Добро пожаловать в Точку с запятой!', '<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email</title>
</head>
<body style="font-family: ''Poppins'', Arial, sans-serif">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" style="padding: 20px;">
                <table class="content" width="1000" border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse; border: 1px solid #cccccc;">
                    <tr>
                        <td class="header" style="background-color: #333; padding: 40px; text-align: center; color: white; font-size: 24px;">
                            <img src="cid:logo" style="max-width: 300px;">
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 18px; line-height: 1.6;">
                            <h1>{{firstName}}, добро пожаловать в Точку с запятой!</h1>
                            Спасибо за регистрацию в нашем библиотечном сервисе! Мы рады, что вы с нами.
                            <br><br>
                            Теперь у вас есть доступ к тысячам разнообразных книг. Мы уверены, что вы найдете что-то интересное для себя!
                            <br>
                            Переходите на сайт и бронируйте понравившуюся книгу!
                        </td>
                    </tr>
                    <tr>
                        <td style="padding: 0px 40px 0px 40px; text-align: center;">
                            <table cellspacing="0" cellpadding="0" style="margin: auto;">
                                <tr>
                                    <td align="center" style="background-color: #333333; padding: 10px 20px; border-radius: 5px;">
                                        <a href="https://localhost:8080/api/v1/book/list?page=0" target="_blank" style="color: #ffffff; text-decoration: none; font-weight: bold;">Посмотреть книги</a>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 16px; line-height: 1.6;">
                            Если у вас возникнут вопросы или потребуется помощь, не стесняйтесь обращаться к нам. Мы всегда рады помочь!
                            <br>
                            С наилучшими пожеланиями, команда "Точка с запятой".
                        </td>
                    </tr>
                    <tr>
                        <td class="footer" style="background-color: #333333; padding: 40px; text-align: center; color: white; font-size: 14px;">
                            <p>&copy; 2024 Точка с запятой. Все права защищены.</p>
                            <p>Контактная информация: liljvrn@yandex.ru</p>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
'),
    ('NEW_RESERVATION', 'Бронирование книги', '<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email</title>
</head>
<body style="font-family: ''Poppins'', Arial, sans-serif">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" style="padding: 20px;">
                <table class="content" width="1000" border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse; border: 1px solid #cccccc;">
                    <tr>
                        <td class="header" style="background-color: #333; padding: 40px; text-align: center; color: white; font-size: 24px;">
                            <img src="cid:logo" style="max-width: 300px;">
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 18px; line-height: 1.6;">
                            <h1>Вы забронировали книгу "{{bookName}}"!</h1>
                            {{firstName}}, спасибо за бронирование! Мы рады сообщить, что книга "{{authorName}}. {{bookName}}", ожидает вас в нашей библиотеке.
                            <br><br>
                            Пожалуйста, заберите её в течение 3-х дней с момента получения этого письма. C {{dueDate}} ваше бронирование будет отменено и книгу сможет забрать кто-нибудь другой.
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 16px; line-height: 1.6;">
                            Если у вас возникнут вопросы или потребуется помощь, не стесняйтесь обращаться к нам. Мы всегда рады помочь!
                            <br>
                            С наилучшими пожеланиями, команда "Точка с запятой".
                        </td>
                    </tr>
                    <tr>
                        <td class="footer" style="background-color: #333333; padding: 40px; text-align: center; color: white; font-size: 14px;">
                            <p>&copy; 2024 Точка с запятой. Все права защищены.</p>
                            <p>Контактная информация: liljvrn@yandex.ru</p>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
'),
       ('END_RENT', 'Аренда подходит к концу', '<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email</title>
</head>
<body style="font-family: ''''Poppins'''', Arial, sans-serif">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" style="padding: 20px;">
                <table class="content" width="1000" border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse; border: 1px solid #cccccc;">
                    <tr>
                        <td class="header" style="background-color: #333; padding: 40px; text-align: center; color: white; font-size: 24px;">
                            <img src="cid:logo" style="max-width: 300px;">
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 18px; line-height: 1.6;">
                            <h1>Аренда книги "{{bookName}}" подходит к концу.</h1>
                            {{firstName}}, аренда книги "{{authorName}}. {{bookName}}", забронированной вами {{currentDate}}, скоро закончится.
                            <br><br>
                            Напоминаем, что вам необходимо вернуть книгу до {{dueDate}}.
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 16px; line-height: 1.6;">
                            Если у вас возникнут вопросы или потребуется помощь, не стесняйтесь обращаться к нам. Мы всегда рады помочь!
                            <br>
                            С наилучшими пожеланиями, команда "Точка с запятой".
                        </td>
                    </tr>
                    <tr>
                        <td class="footer" style="background-color: #333333; padding: 40px; text-align: center; color: white; font-size: 14px;">
                            <p>&copy; 2024 Точка с запятой. Все права защищены.</p>
                            <p>Контактная информация: liljvrn@yandex.ru</p>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
'), ('OVERDUE_RENT', 'Вы просрочили аренду', '<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email</title>
</head>
<body style="font-family: ''''Poppins'''', Arial, sans-serif">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" style="padding: 20px;">
                <table class="content" width="1000" border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse; border: 1px solid #cccccc;">
                    <tr>
                        <td class="header" style="background-color: #333; padding: 40px; text-align: center; color: white; font-size: 24px;">
                            <img src="cid:logo" style="max-width: 300px;">
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 18px; line-height: 1.6;">
                            <h1>{{firstName}}, вы просрочили аренду книги {{bookName}}</h1>
                            Ваша аренда книги "{{authorName}}.  {{bookName}}" истекло. Вам следует немедленно вернуть книгу в библиотеку.
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 16px; line-height: 1.6;">
                            Если у вас возникнут вопросы или потребуется помощь, не стесняйтесь обращаться к нам. Мы всегда рады помочь!
                            <br>
                            С наилучшими пожеланиями, команда "Точка с запятой".
                        </td>
                    </tr>
                    <tr>
                        <td class="footer" style="background-color: #333333; padding: 40px; text-align: center; color: white; font-size: 14px;">
                            <p>&copy; 2024 Точка с запятой. Все права защищены.</p>
                            <p>Контактная информация: liljvrn@yandex.ru</p>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
'), ('ADMIN_MAILING', 'Рассылка библиотеки "Точка с запятой"', '<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email</title>
</head>
<body style="font-family: ''''Poppins'''', Arial, sans-serif">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" style="padding: 20px;">
                <table class="content" width="1000" border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse; border: 1px solid #cccccc;">
                    <tr>
                        <td class="header" style="background-color: #333; padding: 40px; text-align: center; color: white; font-size: 24px;">
                            <img src="cid:logo" style="max-width: 300px;">
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 18px; line-height: 1.6;">
                            <h1>{{title}}</h1>
                            {{payload}}
                        </td>
                    </tr>
                    <tr>
                        <td class="body" style="padding: 40px; text-align: center; font-size: 16px; line-height: 1.6;">
                            Если у вас возникнут вопросы или потребуется помощь, не стесняйтесь обращаться к нам. Мы всегда рады помочь!
                            <br>
                            С наилучшими пожеланиями, команда "Точка с запятой".
                        </td>
                    </tr>
                    <tr>
                        <td class="footer" style="background-color: #333333; padding: 40px; text-align: center; color: white; font-size: 14px;">
                            <p>&copy; 2024 Точка с запятой. Все права защищены.</p>
                            <p>Контактная информация: liljvrn@yandex.ru</p>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
');
