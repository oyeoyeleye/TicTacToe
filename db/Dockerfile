FROM postgres
ENV POSTGRES_USER tttdb
ENV POSTGRES_PASSWORD tttdb
ADD *.sql /docker-entrypoint-initdb.d
EXPOSE 5432
