# Stage 1 - the build process
FROM node:16-bullseye as builder
WORKDIR /app
RUN apt install git -y
RUN git clone https://github.com/blmarquess/Game-Trunfo.git
RUN cp -r Game-Trunfo/* .
RUN npm install && npm run build

# Stage 2 - the production
FROM httpd:latest
WORKDIR /usr/local/apache2/htdocs
RUN rm -rf ./*
COPY --from=builder /app/build .
COPY ./apache-conf/.htaccess ./.htaccess
EXPOSE 80
