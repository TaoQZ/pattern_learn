package taoqz.top.建造者模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/8
 **/
public class PopulationRegist {

    private String name;
    private Integer age;
    private String gender;
    private String idCardNo;
    private String accountBookNo;
    private String birthCertificate;

    private PopulationRegist(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.idCardNo = builder.idCardNo;
        this.accountBookNo = builder.accountBookNo;
        this.birthCertificate = builder.birthCertificate;
    }

    public static class Builder {

        private String name;
        private Integer age;
        private String gender;
        private String idCardNo;
        private String accountBookNo;
        private String birthCertificate;

        public PopulationRegist build() {
            // 必填项校验放在构造函数
            if (null == gender) {
                throw new IllegalArgumentException("gender must be not null");
            }
            return new PopulationRegist(this);
        }

        public Builder age(Integer age) {
            if (null == age) {
                throw new IllegalArgumentException("age must be not null");
            }
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            if (null == gender) {
                throw new IllegalArgumentException("gender must be not null");
            }
            this.gender = gender;
            return this;
        }

        public Builder name(String name) {
            // 参数本身的校验放在 方法里
            if (age == null) {
                throw new IllegalArgumentException("age must be not null");
            }
            if (age > 1 && name == null) {
                throw new IllegalArgumentException("name should be not null");
            }

            if (age >= 0 && age <= 1) {
                if (birthCertificate == null) {
                    throw new IllegalArgumentException("birthCertificate should be not null");
                }
            } else if (age > 2 && age <= 18) {
                if (accountBookNo == null) {
                    throw new IllegalArgumentException("accountBookNo should be not null");
                }
            } else if (age > 18) {
                if (idCardNo == null) {
                    throw new IllegalArgumentException("idCardNo should be not null");
                }
            }
            this.name = name;
            return this;
        }

        public Builder birthCertificate(String birthCertificate) {
            this.birthCertificate = birthCertificate;
            return this;
        }

        public Builder accountBookNo(String accountBookNo) {
            this.accountBookNo = accountBookNo;
            return this;
        }

        public Builder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

    }

}
