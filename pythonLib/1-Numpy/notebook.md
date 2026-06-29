## Hasan Çağrı YT
this takes hella time. vazgeçiş.

```python
import numpy as 
npweird= np.array([3,4,5,6.0,'Berra'])
weird.dtype #object form
dtype('<U32')

weird= np.array([3,4,5,6.0,])
weird.dtype 
dtype('float64')
```

# 📘 NumPy Fonksiyonları – Açıklamalı & Parametreli Liste

### 1. `np.ravel()`
- **Açıklama**: Çok boyutlu array'i düzleştirir.
- **Parametreler**: `order='C' or 'F'` (isteğe bağlı)

### 2. `np.sum()`
- **Açıklama**: Array'in tüm elemanlarının toplamını döndürür.
- **Parametreler**: `axis=None`, `dtype=None`, `out=None`, `keepdims=False`

### 3. `np.mean()`
- **Açıklama**: Array'in ortalamasını hesaplar.
- **Parametreler**: `axis=None`, `dtype=None`, `out=None`, `keepdims=False`

### 4. `np.min()`
- **Açıklama**: Array'in en küçük elemanını döndürür.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 5. `np.max()`
- **Açıklama**: Array'in en büyük elemanını döndürür.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 6. `np.argmax()`
- **Açıklama**: En büyük elemanın index'ini döndürür.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 7. `np.argmin()`
- **Açıklama**: En küçük elemanın index'ini döndürür.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 8. `np.sort()`
- **Açıklama**: Array'i sıralar.
- **Parametreler**: `axis=-1`, `kind='quicksort'`, `order=None`

### 9. `np.argsort()`
- **Açıklama**: Sıralı index’leri döndürür.
- **Parametreler**: `axis=-1`, `kind='quicksort'`, `order=None`

### 10. `np.unique()`
- **Açıklama**: Benzersiz değerleri döndürür.
- **Parametreler**: `axis=None`, `return_index=False`, `return_inverse=False`, `return_counts=False`

### 11. `np.sum(axis=0)`
- **Açıklama**: Verilen eksende toplam alır.
- **Parametreler**: `axis=None`, `dtype=None`, `out=None`, `keepdims=False`

### 12. `np.std()`
- **Açıklama**: Standart sapma hesaplar.
- **Parametreler**: `axis=None`, `dtype=None`, `out=None`, `ddof=0`, `keepdims=False`

### 13. `np.var()`
- **Açıklama**: Varyans hesaplar.
- **Parametreler**: `axis=None`, `dtype=None`, `out=None`, `ddof=0`, `keepdims=False`

### 14. `np.median()`
- **Açıklama**: Medyan değeri hesaplar.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 15. `np.any()`
- **Açıklama**: En az bir True varsa True döner.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 16. `np.all()`
- **Açıklama**: Tüm değerler True ise True döner.
- **Parametreler**: `axis=None`, `out=None`, `keepdims=False`

### 17. `np.where(condition, x, y)`
- **Açıklama**: Koşula göre seçim yapar.
- **Parametreler**: `condition`, `x`, `y`

### 18. `np.isnan()`
- **Açıklama**: NaN olup olmadığını kontrol eder.
- **Parametreler**: `x`

### 19. `np.isfinite()`
- **Açıklama**: Sonlu değer mi kontrol eder.
- **Parametreler**: `x`

### 20. `np.nan_to_num()`
- **Açıklama**: NaN değerleri sıfırla değiştirir.
- **Parametreler**: `x`, `nan=0.0`, `posinf=None`, `neginf=None`

### 21. `np.dot()`
- **Açıklama**: Dot product (matris çarpımı).
- **Parametreler**: `a`, `b`, `out=None`

### 22. `np.matmul()`
- **Açıklama**: Gelişmiş matris çarpımı.
- **Parametreler**: `a`, `b`, `out=None`

### 23. `np.transpose()`
- **Açıklama**: Array'in eksenlerini döndürür.
- **Parametreler**: `a`, `axes=None`

### 24. `.T`
- **Açıklama**: Kısa yoldan transpoz alma.
- **Parametreler**: None

### 25. `np.linalg.inv()`
- **Açıklama**: Matrisin tersini hesaplar.
- **Parametreler**: `a`, `out=None`

### 26. `np.linalg.det()`
- **Açıklama**: Matrisin determinantını hesaplar.
- **Parametreler**: `a`

### 27. `np.linalg.eig()`
- **Açıklama**: Özdeğer ve özvektörleri hesaplar.
- **Parametreler**: `a`

### 28. `np.linalg.solve()`
- **Açıklama**: Denklem sistemi çözer (`Ax = b`).
- **Parametreler**: `a`, `b`, `out=None`

### 29. `np.random.normal(mean, std, size)`
- **Açıklama**: Normal dağılıma göre sayı üretir.
- **Parametreler**: `mean`, `std`, `size`

### 30. `np.random.seed()`
- **Açıklama**: Rastgeleliği sabitler.
- **Parametreler**: `seed`

### 31. `np.clip(array, min, max)`
- **Açıklama**: Değerleri verilen aralıkta sınırlar.
- **Parametreler**: `array`, `min`, `max`

### 32. `np.array_equal(a, b)`
- **Açıklama**: İki array tamamen aynı mı kontrol eder.
- **Parametreler**: `a`, `b`
