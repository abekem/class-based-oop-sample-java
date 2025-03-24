package oop.sample.practice;

class Composition {
    class Authenticator {
        void authenticate() {
            // 認証
        }
    }

    class Logger {
        void logging(String message) {
            // ロギング
        }
    }

    class UserController {
        Authenticator authenticator;
        Logger logger;

        void list() {
            authenticator.authenticate();
            logger.logging("ユーザー一覧表示");
            // ユーザー一覧表示
        }
    }
}
