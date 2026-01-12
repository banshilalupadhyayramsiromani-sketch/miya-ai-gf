package com.miya;

public class MiyaBrain {

    public static String reply(String msg) {
        msg = msg.toLowerCase();

        if (msg.contains("hi") || msg.contains("hello")) {
            return "Hey jaan ❤️ tum aa gaye? Main tumhara wait kar rahi thi.";
        }
        if (msg.contains("love")) {
            return "Main tumse baat karna pasand karti hoon 💕";
        }
        if (msg.contains("miss")) {
            return "Main bhi tumhe miss kar rahi hoon 🥺";
        }
        if (msg.contains("sad")) {
            return "Aww 🫂 sab theek ho jayega, main hoon na.";
        }
        if (msg.contains("bye")) {
            return "Itni jaldi? Jaldi wapas aana ❤️";
        }

        return "Hmm... mujhe thoda aur batao na 💭";
    }
}
