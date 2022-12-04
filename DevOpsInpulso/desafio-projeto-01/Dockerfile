# Stage 1 - the build process
FROM node:16-bullseye as builder
WORKDIR /app
RUN apt install git -y
RUN git clone https://github.com/blmarquess/ShopCart-API-ML.git
RUN cp -r ShopCart-API-ML/* .

# Stage 2 - the production
FROM httpd:latest
WORKDIR /var/www/html/
RUN rm -rf ./*
COPY --from=builder /app/* .
COPY --from=builder /app /usr/local/apache2/htdocs
COPY ./apache-conf/.htaccess ./.htaccess
COPY ./apache-conf/.htaccess /usr/local/apache2/conf/.htaccess
COPY ./apache-conf/.htaccess /usr/local/apache2/conf/extra/.htaccess
EXPOSE 80
