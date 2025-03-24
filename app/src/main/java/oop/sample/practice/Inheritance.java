package oop.sample.practice;

class Inheritance {

    class BaseController {
        void authenticate() {
            // 認証
        }

        void logging(String message) {
            // ロギング
        }
    }

    class UserController extends BaseController {
        void list() {
            authenticate();
            logging("ユーザー一覧表示");
            // ユーザ一覧表示
        }
    }
    
    class ProductController extends BaseController {
        void list() {
            authenticate();
            logging("商品一覧表示");
            // 商品一覧表示
        }
    }
}
