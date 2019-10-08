package com.ukiyu.blog010rps;

public enum Hand {
	ROCK {
		@Override public boolean winsTo(Hand other) { return other.equals(SCISSORS);}
		@Override public boolean losesTo(Hand other) { return other.equals(PAPER);}
	},
	PAPER{
		@Override public boolean winsTo(Hand other) { return other.equals(ROCK);}
		@Override public boolean losesTo(Hand other) { return other.equals(SCISSORS);}
	},
	SCISSORS{
		@Override public boolean winsTo(Hand other) { return other.equals(PAPER);}
		@Override public boolean losesTo(Hand other) { return other.equals(ROCK);}
	};

	abstract public boolean winsTo(Hand other);
	abstract public boolean losesTo(Hand other);

	public boolean drawsTo(Hand other) { return this.equals(other);	}
}
