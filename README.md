# Spring Boot Security Nedir?

Yazdığımız uygulamanın bir güvenlik açığı yaratmaması için kimlik doğrulama (authentication) sistemi kullanmamız gerekmektedir. Uygulamaya giriş yetkisi olan kullanıcıların belirlenmesi ve dışarıdan uygulamaya herhangi bir saldırı olmasını engellemek için zorunlu bir katmandır. Bunu da bize Spring Security sağlamaktadır.

# Uygulama içeriği

Uygulamamızı oluştururken Spring Web ve Spring Security dependency lerini ekledik.

![image](https://user-images.githubusercontent.com/91599453/220279132-dde4f27a-7188-425e-aaab-a0960761ddf2.png)

Controller sınıfında GET metotlarıyla 2 farklı sayfa oluşturuldu.

![image](https://user-images.githubusercontent.com/91599453/220280911-e1d15d6f-a039-4d83-96fb-c874768ee6c7.png)

Config sınıfı oluşturularak HttpSecurity sınıfı metoda dahil edilip herhangi bir isteğin kimlik doğrulama gerektiği belirtildi. 

![image](https://user-images.githubusercontent.com/91599453/220281307-e183eea9-8404-4817-98a5-e9a903e08dae.png)

Daha sonra application.properties dosyasında kullanıcı adı ve şifre property leri belirtildi.

![image](https://user-images.githubusercontent.com/91599453/220282093-1170a281-7b58-45db-accb-9022f40fabbe.png)

Uygulamayı çalıştırdıktan sonra localhost:8080/auth (varsayılan host adresimiz ve controller sınıfında belirlediğimiz "/auth" path adresi) adresine erişmeye çalışınca karşımıza kimlik doğrulama ekranı çıkmaktadır.

![image](https://user-images.githubusercontent.com/91599453/220282617-89d52a17-309d-4fb5-884b-930fc8122a2a.png)

Doğru şekilde giriş yaptıktan sonra aşağıdaki sayfalara erişimimiz sağlanmaktadır.

![image](https://user-images.githubusercontent.com/91599453/220282884-1dc81671-0681-4cf4-ab99-7d6fde746847.png)

![image](https://user-images.githubusercontent.com/91599453/220283332-9c3eb1a7-6e17-40e0-bdaa-736efb8f8b34.png)







