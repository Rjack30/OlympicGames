package Entity;

import java.util.Objects;

public class BaseBallBook {
        String ISBN;

        public String getISBN() {
            return ISBN;
        }

        public boolean equals(Object obj) {
            if (obj instanceof BaseBallBook) {
                return Objects.equals(ISBN, ((BaseBallBook) obj).getISBN());
            } else
                return false;
        }
    }




