# Magics-DRY-SOLID
Magics, DRY, SOLID

SOLID
Class Product - реализация SRP (Single Responsibility Principle)
PriceFilter implements Filter - реализация OCP (Open/Closed Principle), расширение фильтрации товаров
Class Store - реализация LSP (Liskov Substitution Principle), подмена PriceFilter без ошибок.
Interface Filter - реализация ISP (Interface Segregation Principle), содержит один метод filter()
Class Store - реализация DIP (Dependency Inversion Principle), класс зависит от абстракции процесса фильтрации интерфейса Filter

DRY
Class Console - реализация DRY (Don’t Repeat Yourself), использование метода printProducts() для повторного использования
Class Product - реализация Избегание магических чисел, используется константа для максимального рейтинга продукта
