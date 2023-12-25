package hiber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    public Car() {

    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", user=" + user +
                '}';
    }
}
