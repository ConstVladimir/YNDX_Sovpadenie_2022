# YNDX_Sovpadenie_2022
 Алиса Селезнева была невероятно счастлива: она наконец запустила свой новый стартап по распознаванию увиденных облаков, который назвала строкой A длины N. Но вдруг она узнала, что Зелибоба также запустил свой стартап по распознаванию облаков и назвал его строкой B длины N.
Алиса уверена, что Зелибоба сплагиатил её идею! Для начала она хочет вычислить метрику похожести названий их стартапов — если название будет похоже, то ей будет сильно проще в дальнейших доказательствах и разбирательствах.
Более формально, пусть есть строки A — название стартапа Алисы и строка B — название стартапа Зелибобы. Обе строки имеют одинаковую длину N. Для каждой позиции 1≤i≤N строки B, нужно вычислить тип совпадения в этой позиции со строкой A.
Если Bi=Ai, то в позиции i тип совпадения должен быть равен P (от слова plagiarism).
Если Bi≠Ai, но существует другая позиция 1≤j≤N, такая что Bi=Aj, то в позиции i тип совпадения должен быть равен S (от слова suspicious).
Обратите внимание:
    Буквы в рамках одной строки могут повторяться.
    Каждую букву строки A можно использовать не более чем в одном совпадении типа plagiarism или suspicious.
    Предпочтение всегда отдается типу plagiarism.
    В случае совпадения типа suspicious, предпочтение всегда отдается самой левой позиции в строке A.
В остальных позициях тип совпадения должен быть равен I (от слова innocent).
Формат ввода
В первой строке задана строка A (1≤∣∣A∣∣≤106) — название стартапа, выбранное Алисой.
Во второй строке задана строка B (|B|=|A|) — название стартапа Зелибобы.
Гарантируется, что строки A и B содержат только заглавные латинские буквы.
Формат вывода
Выведите единственную строку C(|C|=|B|), где Ci — тип совпадения символа Bi(1≤i≤|B|):
    для типа plagiarismCi= P.
    для типа suspiciousCi= S.
    для типа innocentCi= I.
