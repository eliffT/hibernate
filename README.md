# 🛠️ Hibernate Nedir?

Hibernate, Java ile yazılmış bir ORM (Object Relational Mapping) kütüphanesidir. SQL sorguları yazmadan Java sınıfları üzerinden veritabanı işlemleri yapmamızı sağlar. Bu proje dokümantasyonu, Hibernate'in temel kullanımını ve yapı taşlarını sade bir dille açıklar.

---

## 📌 ORM (Object Relational Mapping) Nedir?

ORM, nesne tabanlı programlama ile ilişkisel veritabanları arasında köprü kurar.  
Java sınıfları ↔ Veritabanı tabloları  
Sınıf değişkenleri ↔ Tablodaki sütunlar

---

## 🚀 Hibernate Ne Sağlar?

| JDBC (Klasik)        | Hibernate (Modern)            |
|----------------------|-------------------------------|
| SQL yazılır          | Hibernate sorguları üretir    |
| ResultSet kullanılır | Java nesneleriyle çalışılır   |
| Kod karmaşık         | Kod okunabilir                |
| Veritabanı bağımlı   | Veritabanı bağımsız           |

---

## 🧱 Temel Hibernate Anotasyonları

- `@Entity` → Sınıf bir veritabanı tablosudur
- `@Table` → Tablo ismini belirtir
- `@Id` → Primary Key (benzersiz anahtar)
- `@GeneratedValue` → ID’nin otomatik artış stratejisi
- `@Column` → Sütun özelliklerini tanımlar
- İlişkiler için: `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`

---

## ⚙️ Hibernate Yapılandırması

Hibernate iki şekilde yapılandırılabilir:

- `hibernate.cfg.xml` dosyası ile
- Java kodu ile programatik olarak

**Temel Ayarlar:**
- Veritabanı URL, kullanıcı adı, şifre
- Dialect (MySQL, PostgreSQL vb.)
- `hbm2ddl.auto`: tablo oluşturma ayarı (`create`, `update`, `validate`, `create-drop`)

---

