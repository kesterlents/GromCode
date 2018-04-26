package lesson15.HomeWork_modifiedLesson9;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class UserRepository {

    User user0 = new User(1234, "Qwerty", "324");
    User user2 = new User(1231, "Qwerty", "324");
    User user3 = new User(12343, "Qwerty", "324");
    User user4 = new User(1235434, "Qwerty", "324");
    User user5 = new User(1232, "Qwerty546", "324");
    User user6 = null;
    User user7 = null;
    User user8 = new User(123235, "Qwerty546", "324");
    User user9 = null;
    User user10 = null;
    private User[] users = new User[]{user0, user2, user3, user4, user5, user6, user7, user8, user9, user10};
    //User save
    //если входящий юзер налл - тогда налл
    //объекты(юзеры) равны, если работает equals
    //если индекс

    public User save(User user) {
        if (user == null) {
            return null;
        }
        if (UserfindById(user.getId()) != null || user.getId() == 0)
            return null;

        int index = 0;
        for (User user1 : users) {
            if (user.equals(user1))
                return null;
            else if (user1 != null)
                index++;
        }
        if (index > 9)
            return null;
        for (User user2 : users) {
            if (user2 == null) {
                user2 = user;
                return user2;
            }
        }

        return null;
    }

    //User update - обновляет и перезаписывает

    public User update(User user) {
        if (user == null)
            return null;
        for (User user1 : users) {
            if (user1 == null)
                continue;
            if (user1.equals(user)) {
                user1 = user;
                return user1;
            }
        }
        return null;
    }

    //delete - ничего не возращает, а только удаляет юзера, найденного по айди
    //если айди не равно нулю
    //юзера ищем по айди с помощью пред.метода
    //если юзер в массиве равен налл


    public void delete(long id) {
        if (id == 0)
            return;
        for (User user : users) {
            if (user == null || user.getId() == 0)
                continue;
            if (id == user.getId()) {
                user = null;
                return;
            }
        }
    }
//User UserFindById
    //Если айди 0
    //Ищем по массиву, есть ли такой юзер с таким айди
    //Если айди юзера = 0

    public User UserfindById(long id) {
        if (id == 0)
            return null;
        for (User user : users) {
            if (user == null || user.getId() == 0)
                continue;
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User[] getUsers() {
        return users;
    }
}






