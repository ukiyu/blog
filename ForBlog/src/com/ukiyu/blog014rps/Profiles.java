package com.ukiyu.blog014rps;

import java.util.List;

public class Profiles {
	private final List<Profile> profiles;

	private Profiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	static public Profiles of(List<Profile> profiles) {
		return new Profiles(profiles);
	}

	public String showNames() {
		return profiles.stream().map(profile->profile.showName()).reduce((connected, name)-> String.join(", ", connected, name)).orElse("");
	}
	
	public String showNamesWithAge() {
		return profiles.stream().map(profile->"(" + profile.showNameWithAge() + ")").reduce((connected, name)-> String.join(", ", connected, name)).orElse("");
	}
}
