package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.User;

public class LoginService {

	public static String login(String username, String password) {

		if (username == null && password == null) {
			return "Моля въведете потребителско име и парола!";
		}

		if (username == null) {
			return "Моля въведете потребителско име!";
		}

		if (password == null) {
			return "Моля въведете парола!";
		}

		List<User> users = getUsers();
		final boolean isUserMatch = users.stream()
				.anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));

		return isUserMatch ? "ОК" : "Потребител с тези данни не съществува!";
	}

	private static List<User> getUsers() {
		User user = new User();
		user.setPassword("Pass123");
		user.setUsername("Ivan");
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}

}
