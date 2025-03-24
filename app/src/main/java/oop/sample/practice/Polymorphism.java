package oop.sample.practice;

import java.util.List;

class Polymorphism {

    // 通知
    class NotificationSender {
        // 通知処理
        void send(String message) {
        }
    }
    
    class DefaultSender extends NotificationSender {
    }

    // メール通知
    class EmailSender extends NotificationSender {
        @Override
        void send(String message) {
            // メール送信
        }
    }

    // Slack通知
    class SlackSender extends NotificationSender {
        @Override
        void send(String message) {
            // Slack送信
        }
    }

    void sendEach(List<NotificationSender> senders, String message) {
        for (NotificationSender sender : senders) {
            sender.send(message);
        }
    }
}
