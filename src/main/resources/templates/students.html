<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Student Info System</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            border: 1px solid #ccc;
            text-align: left;
        }
        form {
            margin-top: 20px;
        }
        input {
            margin: 5px;
        }
        button {
            padding: 5px 10px;
        }
        .action-buttons {
            display: flex;
            gap: 10px;
        }
    </style>
</head>
<body>
    <h1>Student List</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Course</th>
                <th>Age</th>
                <th>Grade</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="student : ${students}">
                <td th:text="${student.id}"></td>
                <td th:text="${student.name}"></td>
                <td th:text="${student.email}"></td>
                <td th:text="${student.course}"></td>
                <td th:text="${student.age}"></td>
                <td th:text="${student.grade}"></td>
                <td class="action-buttons">
                    <a th:href="@{'/students/edit/' + ${student.id}}">
                        <button type="button">Edit</button>
                    </a>
                    <form th:action="@{'/students/delete/' + ${student.id}}" method="post">
                        <button type="submit" style="background-color: red; color: white;">Delete</button>
                    </form>
                </td>
            </tr>
        </tbody>
    </table>

    <h2 th:text="${student.id != null} ? 'Edit Student' : 'Add Student'"></h2>
    <form th:action="@{/students/update}" th:object="${student}" method="post">
        <input type="hidden" th:field="*{id}" />
        <input type="text" th:field="*{name}" placeholder="Name" required />
        <input type="email" th:field="*{email}" placeholder="Email" required />
        <input type="text" th:field="*{course}" placeholder="Course" required />
        <input type="number" th:field="*{age}" placeholder="Age" required />
        <input type="number" th:field="*{grade}" placeholder="Grade" required />
        <button type="submit" th:text="${student.id != null} ? 'Update' : 'Add'"></button>
    </form>
</body>
</html>