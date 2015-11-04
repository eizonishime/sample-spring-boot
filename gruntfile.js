'use strict';

module.exports = function (grunt) {
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        
        sass: {
            dist: {
            	files: [{
                    expand: true,
                    cwd: 'src/main/resources/public/app/styles',
                    src: ['**/*.scss'],
                    dest: 'src/main/resources/public/app/styles/css/',
                    ext: '.css'
                }]
            }
        }
        
    });
    
    require('load-grunt-tasks')(grunt);
    
    grunt.registerTask('default', 'sass');
};
