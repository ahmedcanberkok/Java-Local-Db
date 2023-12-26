# Enoca Backend Challenge


# **Proje Tanımı**

Bu proje, Spring LocalDatabase kurulumu amacıyla geliştirilmiş bir Java uygulamasıdır. Proje, MVC (Model-View-Controller) tasarım deseni kullanılarak yapılandırılmıştır.

### **Proje Yapısı**

src/main/java: Java sınıflarını içerir.

com.example.EnocaBackendChallenge.entity: Model sınıflarını içerir.

com.example.EnocaBackendChallenge.controller: Controller sınıflarını içerir.

com.example.EnocaBackendChallenge.service: Servis sınıflarını içerir.

application.properties: Uygulama yapılandırma dosyası.
src/test: Test dosyalarını içerir.

### **Kullanılan Teknolojiler**

**Spring Boot**: Uygulamanın temel altyapısı.

**Maven/Gradle**: Bağımlılıkların yönetimi ve proje derleme süreçleri için kullanılmaktadır.

### **Servis Kullanımı**

**EmployeeController** sınıfının sağladığı endpoint'leri kullanarak servisleri test edebilirsiniz.
 http://localhost:8080/employees/ adresi üzerinden tüm endpoint'leri test edebilirsiniz.

**AddressController** sınıfının sağladığı endpoint'leri kullanarak servisleri test edebilirsiniz.
http://localhost:8080/address/ adresi üzerinden tüm endpoint'leri test edebilirsiniz.

[GET]/address => veri tabanaında kayıtlı tüm address bilgilerini döner.

[GET]/address/{id} => İlgili id deki address objesini döner.

[POST]/address => Bir adet address objesini veri tabanına ekler.

[PUT]/address/{id} => İlgili id deki address objesinin değerlerini günceller.

[DELETE]/address/{id} => İlgili id değerindeki address objesini siler.

[GET]/employees => veri tabanında kayıtlı tüm employee bilgilerini döner.

[GET]/employees/{id} => İlgili id deki employee objesini dönmeli.

[POST]/employees => Bir adet employee objesini veri tabanına ekler

[PUT]/employees/{id} => İlgili id deki employee objesinin değerlerini günceller.

[DELETE]/employees/{id} => İlgili id değerindeki employee objesini siler.

### **Ek Bilgiler**
Proje yapılandırması ve bağımlılıkları için application.properties dosyasını inceleyin.
Testleri çalıştırmak için src/test klasörüne göz atın.