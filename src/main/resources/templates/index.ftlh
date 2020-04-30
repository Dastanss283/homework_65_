<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Lesson 65. JPA & ORM</title>
    </head>
    <body>
        <h1>Содержимое страницы</h1>

        <ul>
        <#list foodTypes as ft>
            <li>
                <p>${ft.id} - ${ft.name} - ${ft.icon}</p>
            </li>
        </#list>
        </ul>

        <ul>
            <#list places as p>
                <li>
                    <p>${p.id} - ${p.name} - ${p.icon}</p>
                </li>
            </#list>
        </ul>

    </body>
</html>
