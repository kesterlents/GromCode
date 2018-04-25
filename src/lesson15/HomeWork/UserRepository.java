package lesson15.HomeWork;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class UserRepository {
    private User[] users = new User[10];

    public UserRepository(User[] users) {
        this.users = users;
    }

    //User save
    //если входящий юзер налл - тогда налл
    //объекты(юзеры) равны, если работает equals
    //если индекс

    public User save(User user) {
        if (user == null) {
            return null;
        }
        int index = 0;
        for (User user1 : getUsers()) {
            if (user.equals(user1))
                return null;
            else if (user1 != null)
                index++;
        }
        if (index == 10)
            return null;
        for (User user2 : getUsers()) {
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
        for (User user1 : getUsers()) {
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
        for (User user : getUsers()) {
            if (user == null || UserfindById(id) == null)
                continue;
            if (user == UserfindById(id)) {
                user = null;
                break;
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
        for (User user : getUsers()) {
            if (user == null)
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







