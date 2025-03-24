package oop.sample.practice;

class Union {
    // 従業員
    class Employee {
        // 名前
        String name;

        // コンストラクタ
        Employee(String name) {
            this.name = name;
        }

        // 給与計算
        int calculateSalary() {
            return 0;
        }
    }

    // 正社員
    class FullTimeEmployee extends Employee {
        // 月給
        int monthlySalary;

        // コンストラクタ
        FullTimeEmployee(String name, int monthlySalary) {
            super(name);
            this.monthlySalary = monthlySalary;
        }

        // 給与計算
        @Override
        int calculateSalary() {
            return this.monthlySalary;
        }
    }

    // アルバイト
    class PartTimeEmployee extends Employee {
        // 時給
        int hourlyWage;
        // 勤務時間
        int workingHours;

        // コンストラクタ
        PartTimeEmployee(String name, int hourlyWage, int workingHours) {
            super(name);
            this.hourlyWage = hourlyWage;
            this.workingHours = workingHours;
        }

        // 給与計算
        @Override
        int calculateSalary() {
            return this.hourlyWage * this.workingHours;
        }
    }
}
