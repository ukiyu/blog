package com.ukiyu.blog013rps;

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
	},

	// 架空の最強の手
	STRONGEST{
		@Override public boolean winsTo(Hand other) { return true;}
		@Override public boolean losesTo(Hand other) { return false;}
	},
	// 架空の最弱の手
	WEAKEST{
		@Override public boolean winsTo(Hand other) { return false;}
		@Override public boolean losesTo(Hand other) { return true;}
	};

	abstract public boolean winsTo(Hand other);
	abstract public boolean losesTo(Hand other);

	public boolean drawsTo(Hand other) { return this.equals(other);	}
}
