
# CookBook API

CookBook API é um microserviço para disponibilidade de dados de receitas de alimentos via API Rest.

O serviço é desenvolvido usando Spring Framework.

## Banco de Dados: Tabelas

```sql
Table: categorias
+--------+------------------------+
| Column |          Type          |
+--------+------------------------+
| id     | bigint                 |
| nome   | character varying(255) |
+--------+------------------------+

Table: receitas
+---------------+------------------------+
|    Column     |          Type          |
+---------------+------------------------+
| id            | bigint                 |
| ingredientes  | character varying(255) |
| preparo       | character varying(255) |
| tempo_preparo | time without time zone |
| titulo        | character varying(255) |
| categoria_id  | bigint                 |
+---------------+------------------------+
```

## End-Points

| HTTP Method | End-Point |
|-------------|-----------|
| (GET) | /api/categoria/all          |
| (GET) | /api/categoria/{id}         |
| (PUT) | /api/categoria/update       |
| (POST) | /api/categoria/create       |
| (DELETE) | /api/categoria/delete/{id}  |

(GET)       /api/receita/all
(GET)       /api/receita/{id}
(GET)       /api/receita/lista/categoria/{id}
(PUT)       /api/receita/update
(POST)      /api/receita/create
(DELETE)    /api/receita/delete/{id}

(GET)       /api/seeder/categoria
(GET)       /api/seeder/receita