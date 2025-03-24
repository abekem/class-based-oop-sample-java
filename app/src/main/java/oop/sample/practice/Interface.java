package oop.sample.practice;

import java.util.List;

public class Interface {

    // 通知
    interface NotificationSender {
        // 通知処理
        void send(String message);
    }
    
    class DefaultSender implements NotificationSender {
        @Override
        public void send(String message) {
            // 何か実装が必要
        }
    }

    // メール通知
    class EmailSender implements NotificationSender {
        @Override
        public void send(String message) {
            // メール送信
        }
    }

    // Slack通知
    class SlackSender implements NotificationSender {
        @Override
        public void send(String message) {
            // Slack送信
        }
    }

    void sendEach(List<NotificationSender> senders, String message) {
        for (NotificationSender sender : senders) {
            sender.send(message);
        }
    }

    interface Bird {
    }

    interface Flyable {
        void fly();
    }
    
    interface Swimmable {
        void swim();
    }

    // ハト
    class Pigeon implements Bird, Flyable {
        @Override
        public void fly() {
            // 飛ぶ
        }
    }

    // ペンギン
    class Penguin implements Bird, Swimmable {
            // 飛べない
        
        @Override
        public void swim() {
            // 泳ぐ
        }
    }
}
